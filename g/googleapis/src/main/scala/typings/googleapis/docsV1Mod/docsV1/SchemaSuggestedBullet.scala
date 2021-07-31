package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A suggested change to a Bullet.
  */
trait SchemaSuggestedBullet extends StObject {
  
  /**
    * A Bullet that only includes the changes made in this suggestion. This can
    * be used along with the bullet_suggestion_state to see which fields have
    * changed and their new values.
    */
  var bullet: js.UndefOr[SchemaBullet] = js.undefined
  
  /**
    * A mask that indicates which of the fields on the base Bullet have been
    * changed in this suggestion.
    */
  var bulletSuggestionState: js.UndefOr[SchemaBulletSuggestionState] = js.undefined
}
object SchemaSuggestedBullet {
  
  @scala.inline
  def apply(): SchemaSuggestedBullet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedBullet]
  }
  
  @scala.inline
  implicit class SchemaSuggestedBulletMutableBuilder[Self <: SchemaSuggestedBullet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBullet(value: SchemaBullet): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletSuggestionState(value: SchemaBulletSuggestionState): Self = StObject.set(x, "bulletSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletSuggestionStateUndefined: Self = StObject.set(x, "bulletSuggestionState", js.undefined)
    
    @scala.inline
    def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
  }
}
