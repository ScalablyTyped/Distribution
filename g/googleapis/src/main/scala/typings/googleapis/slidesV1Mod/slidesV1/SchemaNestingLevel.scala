package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties describing the look and feel of a list bullet at a
  * given level of nesting.
  */
@js.native
trait SchemaNestingLevel extends StObject {
  
  /**
    * The style of a bullet at this level of nesting.
    */
  var bulletStyle: js.UndefOr[SchemaTextStyle] = js.native
}
object SchemaNestingLevel {
  
  @scala.inline
  def apply(): SchemaNestingLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNestingLevel]
  }
  
  @scala.inline
  implicit class SchemaNestingLevelMutableBuilder[Self <: SchemaNestingLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulletStyle(value: SchemaTextStyle): Self = StObject.set(x, "bulletStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletStyleUndefined: Self = StObject.set(x, "bulletStyle", js.undefined)
  }
}
