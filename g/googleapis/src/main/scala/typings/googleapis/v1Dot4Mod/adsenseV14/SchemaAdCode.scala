package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdCode extends StObject {
  
  /**
    * The Auto ad code snippet. The ad code snippet.
    */
  var adCode: js.UndefOr[String] = js.undefined
  
  /**
    * The AMP Auto ad code snippet that goes in the body of an AMP page.
    */
  var ampBody: js.UndefOr[String] = js.undefined
  
  /**
    * The AMP Auto ad code snippet that goes in the head of an AMP page.
    */
  var ampHead: js.UndefOr[String] = js.undefined
  
  /**
    * Kind this is, in this case adsense#adCode.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaAdCode {
  
  @scala.inline
  def apply(): SchemaAdCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdCode]
  }
  
  @scala.inline
  implicit class SchemaAdCodeMutableBuilder[Self <: SchemaAdCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdCode(value: String): Self = StObject.set(x, "adCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdCodeUndefined: Self = StObject.set(x, "adCode", js.undefined)
    
    @scala.inline
    def setAmpBody(value: String): Self = StObject.set(x, "ampBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmpBodyUndefined: Self = StObject.set(x, "ampBody", js.undefined)
    
    @scala.inline
    def setAmpHead(value: String): Self = StObject.set(x, "ampHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmpHeadUndefined: Self = StObject.set(x, "ampHead", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
