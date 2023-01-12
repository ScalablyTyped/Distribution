package typings.i18next.mod

import typings.i18next.i18nextBooleans.`false`
import typings.i18next.i18nextBooleans.`true`
import typings.i18next.i18nextStrings.Colon
import typings.i18next.i18nextStrings.Dot
import typings.i18next.i18nextStrings.translation
import typings.i18next.i18nextStrings.v4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined i18next.i18next.MergeBy<{  returnNull :true,   returnEmptyString :true,   keySeparator :'.',   nsSeparator :':',   defaultNS :'translation',   jsonFormat :'v4',   resources :object,   allowObjectInHTMLChildren :false}, i18next.i18next.CustomTypeOptions> */
trait TypeOptions extends StObject {
  
  var allowObjectInHTMLChildren: `false`
  
  var defaultNS: translation
  
  var jsonFormat: v4
  
  var keySeparator: Dot
  
  var nsSeparator: Colon
  
  var resources: js.Object
  
  var returnEmptyString: `true`
  
  var returnNull: `true`
}
object TypeOptions {
  
  inline def apply(resources: js.Object): TypeOptions = {
    val __obj = js.Dynamic.literal(allowObjectInHTMLChildren = false, defaultNS = "translation", jsonFormat = "v4", keySeparator = ".", nsSeparator = ":", resources = resources.asInstanceOf[js.Any], returnEmptyString = true, returnNull = true)
    __obj.asInstanceOf[TypeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowObjectInHTMLChildren(value: `false`): Self = StObject.set(x, "allowObjectInHTMLChildren", value.asInstanceOf[js.Any])
    
    inline def setDefaultNS(value: translation): Self = StObject.set(x, "defaultNS", value.asInstanceOf[js.Any])
    
    inline def setJsonFormat(value: v4): Self = StObject.set(x, "jsonFormat", value.asInstanceOf[js.Any])
    
    inline def setKeySeparator(value: Dot): Self = StObject.set(x, "keySeparator", value.asInstanceOf[js.Any])
    
    inline def setNsSeparator(value: Colon): Self = StObject.set(x, "nsSeparator", value.asInstanceOf[js.Any])
    
    inline def setResources(value: js.Object): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setReturnEmptyString(value: `true`): Self = StObject.set(x, "returnEmptyString", value.asInstanceOf[js.Any])
    
    inline def setReturnNull(value: `true`): Self = StObject.set(x, "returnNull", value.asInstanceOf[js.Any])
  }
}
