package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggested change to a Bullet.
  */
@js.native
trait SchemaSuggestedBullet extends js.Object {
  /**
    * A Bullet that only includes the changes made in this suggestion. This can
    * be used along with the bullet_suggestion_state to see which fields have
    * changed and their new values.
    */
  var bullet: js.UndefOr[SchemaBullet] = js.native
  /**
    * A mask that indicates which of the fields on the base Bullet have been
    * changed in this suggestion.
    */
  var bulletSuggestionState: js.UndefOr[SchemaBulletSuggestionState] = js.native
}

object SchemaSuggestedBullet {
  @scala.inline
  def apply(bullet: SchemaBullet = null, bulletSuggestionState: SchemaBulletSuggestionState = null): SchemaSuggestedBullet = {
    val __obj = js.Dynamic.literal()
    if (bullet != null) __obj.updateDynamic("bullet")(bullet.asInstanceOf[js.Any])
    if (bulletSuggestionState != null) __obj.updateDynamic("bulletSuggestionState")(bulletSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSuggestedBullet]
  }
}

