package typings.materialDom

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object announceMod {
  
  @JSImport("@material/dom/announce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait AnnouncerPriority extends StObject
  @JSImport("@material/dom/announce", "AnnouncerPriority")
  @js.native
  object AnnouncerPriority extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AnnouncerPriority & String] = js.native
    
    @js.native
    sealed trait ASSERTIVE
      extends StObject
         with AnnouncerPriority
    /* "assertive" */ val ASSERTIVE: typings.materialDom.announceMod.AnnouncerPriority.ASSERTIVE & String = js.native
    
    @js.native
    sealed trait POLITE
      extends StObject
         with AnnouncerPriority
    /* "polite" */ val POLITE: typings.materialDom.announceMod.AnnouncerPriority.POLITE & String = js.native
  }
  
  @JSImport("@material/dom/announce", "DATA_MDC_DOM_ANNOUNCE")
  @js.native
  val DATA_MDC_DOM_ANNOUNCE: /* "data-mdc-dom-announce" */ String = js.native
  
  inline def announce(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("announce")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def announce(message: String, options: AnnouncerMessageOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("announce")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait AnnouncerMessageOptions extends StObject {
    
    var ownerDocument: js.UndefOr[Document] = js.undefined
    
    var priority: js.UndefOr[AnnouncerPriority] = js.undefined
  }
  object AnnouncerMessageOptions {
    
    inline def apply(): AnnouncerMessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnouncerMessageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnnouncerMessageOptions] (val x: Self) extends AnyVal {
      
      inline def setOwnerDocument(value: Document): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
      
      inline def setOwnerDocumentUndefined: Self = StObject.set(x, "ownerDocument", js.undefined)
      
      inline def setPriority(value: AnnouncerPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
}
