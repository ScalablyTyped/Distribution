package typings.jsGravatar.mod

import typings.jsGravatar.jsGravatarStrings.`404`
import typings.jsGravatar.jsGravatarStrings.blank
import typings.jsGravatar.jsGravatarStrings.identicon
import typings.jsGravatar.jsGravatarStrings.monsterid
import typings.jsGravatar.jsGravatarStrings.mp
import typings.jsGravatar.jsGravatarStrings.retro
import typings.jsGravatar.jsGravatarStrings.robohash
import typings.jsGravatar.jsGravatarStrings.wavatar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    *  What image should be used if email does not have a gravatar
    */
  var defaultImage: js.UndefOr[`404` | mp | identicon | monsterid | wavatar | retro | robohash | blank] = js.native
  
  /**
    * Email address of the user to generate gravatar for
    */
  var email: String = js.native
  
  /**
    *  Optional: MD5 hash of the email above.
    * If email is provided, md5hash will be ignored. If neither email nor md5hash is provided, the library will throw en error
    */
  var md5Hash: js.UndefOr[String] = js.native
  
  /**
    * The size of the image to be displayed. Should be from 1 to 2048
    */
  var size: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(email: String): Options = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultImage(value: `404` | mp | identicon | monsterid | wavatar | retro | robohash | blank): Self = this.set("defaultImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultImage: Self = this.set("defaultImage", js.undefined)
    
    @scala.inline
    def setMd5Hash(value: String): Self = this.set("md5Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd5Hash: Self = this.set("md5Hash", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
