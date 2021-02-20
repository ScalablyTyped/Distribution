package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @OutputOnly The type of platform the restriction applies to.
  */
@js.native
trait SchemaPlatformContext extends StObject {
  
  /**
    * The platforms this restriction applies to.
    */
  var platforms: js.UndefOr[js.Array[String]] = js.native
}
object SchemaPlatformContext {
  
  @scala.inline
  def apply(): SchemaPlatformContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlatformContext]
  }
  
  @scala.inline
  implicit class SchemaPlatformContextMutableBuilder[Self <: SchemaPlatformContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    @scala.inline
    def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value :_*))
  }
}
