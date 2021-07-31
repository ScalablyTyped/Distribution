package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds and removes POSIX capabilities from running containers.
  */
trait SchemaCapabilities extends StObject {
  
  /**
    * Added capabilities +optional
    */
  var add: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Removed capabilities +optional
    */
  var drop: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaCapabilities {
  
  @scala.inline
  def apply(): SchemaCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCapabilities]
  }
  
  @scala.inline
  implicit class SchemaCapabilitiesMutableBuilder[Self <: SchemaCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: js.Array[String]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setAddVarargs(value: String*): Self = StObject.set(x, "add", js.Array(value :_*))
    
    @scala.inline
    def setDrop(value: js.Array[String]): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    @scala.inline
    def setDropVarargs(value: String*): Self = StObject.set(x, "drop", js.Array(value :_*))
  }
}
