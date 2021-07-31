package typings.localforage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalForageOptions
  extends StObject
     with LocalForageDbInstanceOptions {
  
  var description: js.UndefOr[String] = js.undefined
  
  var driver: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object LocalForageOptions {
  
  @scala.inline
  def apply(): LocalForageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalForageOptions]
  }
  
  @scala.inline
  implicit class LocalForageOptionsMutableBuilder[Self <: LocalForageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDriver(value: String | js.Array[String]): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
    
    @scala.inline
    def setDriverVarargs(value: String*): Self = StObject.set(x, "driver", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
