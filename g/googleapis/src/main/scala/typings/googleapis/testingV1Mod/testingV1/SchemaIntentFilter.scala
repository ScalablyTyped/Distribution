package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The &lt;intent-filter&gt; section of an &lt;activity&gt; tag.
  * https://developer.android.com/guide/topics/manifest/intent-filter-element.html
  */
trait SchemaIntentFilter extends StObject {
  
  /**
    * The android:name value of the &lt;action&gt; tag.
    */
  var actionNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The android:name value of the &lt;category&gt; tag.
    */
  var categoryNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The android:mimeType value of the &lt;data&gt; tag.
    */
  var mimeType: js.UndefOr[String] = js.undefined
}
object SchemaIntentFilter {
  
  inline def apply(): SchemaIntentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntentFilter]
  }
  
  extension [Self <: SchemaIntentFilter](x: Self) {
    
    inline def setActionNames(value: js.Array[String]): Self = StObject.set(x, "actionNames", value.asInstanceOf[js.Any])
    
    inline def setActionNamesUndefined: Self = StObject.set(x, "actionNames", js.undefined)
    
    inline def setActionNamesVarargs(value: String*): Self = StObject.set(x, "actionNames", js.Array(value :_*))
    
    inline def setCategoryNames(value: js.Array[String]): Self = StObject.set(x, "categoryNames", value.asInstanceOf[js.Any])
    
    inline def setCategoryNamesUndefined: Self = StObject.set(x, "categoryNames", js.undefined)
    
    inline def setCategoryNamesVarargs(value: String*): Self = StObject.set(x, "categoryNames", js.Array(value :_*))
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
