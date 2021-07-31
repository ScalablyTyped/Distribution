package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The display options for an object.
  */
trait SchemaObjectDisplayOptions extends StObject {
  
  /**
    * Defines the properties that will be displayed in the metalines of the
    * search results. The property values will be displayed in the order given
    * here. If a property holds multiple values, all of the values will be
    * diplayed before the next properties. For this reason, it is a good
    * practice to specify singular properties before repeated properties in
    * this list. All of the properties must set is_returnable to true. The
    * maximum number of elements is 3.
    */
  var metalines: js.UndefOr[js.Array[SchemaMetaline]] = js.undefined
  
  /**
    * The user friendly label to display in the search result to inidicate the
    * type of the item. This is OPTIONAL; if not given, an object label will
    * not be displayed on the context line of the search results. The maximum
    * length is 32 characters.
    */
  var objectDisplayLabel: js.UndefOr[String] = js.undefined
}
object SchemaObjectDisplayOptions {
  
  @scala.inline
  def apply(): SchemaObjectDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectDisplayOptions]
  }
  
  @scala.inline
  implicit class SchemaObjectDisplayOptionsMutableBuilder[Self <: SchemaObjectDisplayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetalines(value: js.Array[SchemaMetaline]): Self = StObject.set(x, "metalines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetalinesUndefined: Self = StObject.set(x, "metalines", js.undefined)
    
    @scala.inline
    def setMetalinesVarargs(value: SchemaMetaline*): Self = StObject.set(x, "metalines", js.Array(value :_*))
    
    @scala.inline
    def setObjectDisplayLabel(value: String): Self = StObject.set(x, "objectDisplayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectDisplayLabelUndefined: Self = StObject.set(x, "objectDisplayLabel", js.undefined)
  }
}
