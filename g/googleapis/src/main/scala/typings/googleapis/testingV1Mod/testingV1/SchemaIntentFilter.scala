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
  
  @scala.inline
  def apply(): SchemaIntentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntentFilter]
  }
  
  @scala.inline
  implicit class SchemaIntentFilterMutableBuilder[Self <: SchemaIntentFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionNames(value: js.Array[String]): Self = StObject.set(x, "actionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNamesUndefined: Self = StObject.set(x, "actionNames", js.undefined)
    
    @scala.inline
    def setActionNamesVarargs(value: String*): Self = StObject.set(x, "actionNames", js.Array(value :_*))
    
    @scala.inline
    def setCategoryNames(value: js.Array[String]): Self = StObject.set(x, "categoryNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryNamesUndefined: Self = StObject.set(x, "categoryNames", js.undefined)
    
    @scala.inline
    def setCategoryNamesVarargs(value: String*): Self = StObject.set(x, "categoryNames", js.Array(value :_*))
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
