package typings.kdbxweb

import typings.kdbxweb.distTypesFormatKdbxMod.Kdbx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Binaries extends StObject {
    
    var binaries: js.UndefOr[Boolean] = js.undefined
    
    var customIcons: js.UndefOr[Boolean] = js.undefined
    
    var historyRules: js.UndefOr[Boolean] = js.undefined
  }
  object Binaries {
    
    inline def apply(): Binaries = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Binaries]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Binaries] (val x: Self) extends AnyVal {
      
      inline def setBinaries(value: Boolean): Self = StObject.set(x, "binaries", value.asInstanceOf[js.Any])
      
      inline def setBinariesUndefined: Self = StObject.set(x, "binaries", js.undefined)
      
      inline def setCustomIcons(value: Boolean): Self = StObject.set(x, "customIcons", value.asInstanceOf[js.Any])
      
      inline def setCustomIconsUndefined: Self = StObject.set(x, "customIcons", js.undefined)
      
      inline def setHistoryRules(value: Boolean): Self = StObject.set(x, "historyRules", value.asInstanceOf[js.Any])
      
      inline def setHistoryRulesUndefined: Self = StObject.set(x, "historyRules", js.undefined)
    }
  }
  
  trait ExportXml extends StObject {
    
    var exportXml: js.UndefOr[Boolean] = js.undefined
    
    var kdbx: Kdbx
  }
  object ExportXml {
    
    inline def apply(kdbx: Kdbx): ExportXml = {
      val __obj = js.Dynamic.literal(kdbx = kdbx.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportXml]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportXml] (val x: Self) extends AnyVal {
      
      inline def setExportXml(value: Boolean): Self = StObject.set(x, "exportXml", value.asInstanceOf[js.Any])
      
      inline def setExportXmlUndefined: Self = StObject.set(x, "exportXml", js.undefined)
      
      inline def setKdbx(value: Kdbx): Self = StObject.set(x, "kdbx", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreserveXml extends StObject {
    
    var preserveXml: js.UndefOr[Boolean] = js.undefined
  }
  object PreserveXml {
    
    inline def apply(): PreserveXml = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreserveXml]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreserveXml] (val x: Self) extends AnyVal {
      
      inline def setPreserveXml(value: Boolean): Self = StObject.set(x, "preserveXml", value.asInstanceOf[js.Any])
      
      inline def setPreserveXmlUndefined: Self = StObject.set(x, "preserveXml", js.undefined)
    }
  }
}
