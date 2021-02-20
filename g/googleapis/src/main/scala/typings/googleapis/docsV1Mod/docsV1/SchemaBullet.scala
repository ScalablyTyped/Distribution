package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the bullet of a paragraph.
  */
@js.native
trait SchemaBullet extends StObject {
  
  /**
    * The ID of the list this paragraph belongs to.
    */
  var listId: js.UndefOr[String] = js.native
  
  /**
    * The nesting level of this paragraph in the list.
    */
  var nestingLevel: js.UndefOr[Double] = js.native
  
  /**
    * The paragraph specific text style applied to this bullet.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.native
}
object SchemaBullet {
  
  @scala.inline
  def apply(): SchemaBullet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBullet]
  }
  
  @scala.inline
  implicit class SchemaBulletMutableBuilder[Self <: SchemaBullet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
    
    @scala.inline
    def setNestingLevel(value: Double): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
    
    @scala.inline
    def setTextStyle(value: SchemaTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
