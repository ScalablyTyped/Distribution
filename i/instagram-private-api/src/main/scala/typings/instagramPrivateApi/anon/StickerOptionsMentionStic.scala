package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StringDictionary
import typings.instagramPrivateApi.instagramPrivateApiStrings.mention_reshare
import typings.instagramPrivateApi.instagramPrivateApiStrings.mention_username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined instagram-private-api.instagram-private-api/dist/sticker-builder/sticker-builder.StickerOptions<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.MentionSticker> */
@js.native
trait StickerOptionsMentionStic extends js.Object {
  
  var additionalConfigureProperties: js.UndefOr[js.Function0[_]] = js.native
  
  var bottom: js.UndefOr[js.Function0[this.type]] = js.native
  
  var center: js.UndefOr[js.Function0[this.type]] = js.native
  
  var displayType: js.UndefOr[mention_username | mention_reshare] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var id: js.UndefOr[js.Function0[String]] = js.native
  
  var isSticker: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[js.Function0[String]] = js.native
  
  var left: js.UndefOr[js.Function0[this.type]] = js.native
  
  var mediaId: js.UndefOr[String] = js.native
  
  var moveBackwards: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.native
  
  var moveForward: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.native
  
  var right: js.UndefOr[js.Function0[this.type]] = js.native
  
  var rotateDeg: js.UndefOr[js.Function1[/* deg */ Double, this.type]] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[js.Function1[/* factor */ Double, this.type]] = js.native
  
  var toJSON: js.UndefOr[js.Function0[StringDictionary[_]]] = js.native
  
  var top: js.UndefOr[js.Function0[this.type]] = js.native
  
  var userId: String = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
  
  var z: js.UndefOr[Double] = js.native
}
object StickerOptionsMentionStic {
  
  @scala.inline
  def apply(userId: String): StickerOptionsMentionStic = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickerOptionsMentionStic]
  }
  
  @scala.inline
  implicit class StickerOptionsMentionSticOps[Self <: StickerOptionsMentionStic] (val x: Self) extends AnyVal {
    
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
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalConfigureProperties(value: () => _): Self = this.set("additionalConfigureProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAdditionalConfigureProperties: Self = this.set("additionalConfigureProperties", js.undefined)
    
    @scala.inline
    def setBottom(value: () => StickerOptionsMentionStic): Self = this.set("bottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setCenter(value: () => StickerOptionsMentionStic): Self = this.set("center", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setDisplayType(value: mention_username | mention_reshare): Self = this.set("displayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayType: Self = this.set("displayType", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setId(value: () => String): Self = this.set("id", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsSticker(value: Boolean): Self = this.set("isSticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSticker: Self = this.set("isSticker", js.undefined)
    
    @scala.inline
    def setKey(value: () => String): Self = this.set("key", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLeft(value: () => StickerOptionsMentionStic): Self = this.set("left", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setMediaId(value: String): Self = this.set("mediaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaId: Self = this.set("mediaId", js.undefined)
    
    @scala.inline
    def setMoveBackwards(value: /* layers */ js.UndefOr[Double] => StickerOptionsMentionStic): Self = this.set("moveBackwards", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMoveBackwards: Self = this.set("moveBackwards", js.undefined)
    
    @scala.inline
    def setMoveForward(value: /* layers */ js.UndefOr[Double] => StickerOptionsMentionStic): Self = this.set("moveForward", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMoveForward: Self = this.set("moveForward", js.undefined)
    
    @scala.inline
    def setRight(value: () => StickerOptionsMentionStic): Self = this.set("right", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setRotateDeg(value: /* deg */ Double => StickerOptionsMentionStic): Self = this.set("rotateDeg", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRotateDeg: Self = this.set("rotateDeg", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setScale(value: /* factor */ Double => StickerOptionsMentionStic): Self = this.set("scale", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setToJSON(value: () => StringDictionary[_]): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToJSON: Self = this.set("toJSON", js.undefined)
    
    @scala.inline
    def setTop(value: () => StickerOptionsMentionStic): Self = this.set("top", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
  }
}
