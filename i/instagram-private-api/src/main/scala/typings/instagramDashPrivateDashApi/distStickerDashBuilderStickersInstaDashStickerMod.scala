package typings.instagramDashPrivateDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/stickers/insta-sticker", JSImport.Namespace)
@js.native
object distStickerDashBuilderStickersInstaDashStickerMod extends js.Object {
  @js.native
  abstract class InstaSticker () extends js.Object {
    var height: Double = js.native
    var isSticker: Boolean = js.native
    var rotation: Double = js.native
    var width: Double = js.native
    var x: Double = js.native
    var y: Double = js.native
    var z: Double = js.native
    def bottom(): this.type = js.native
    def center(): this.type = js.native
    def id(): String = js.native
    def key(): String = js.native
    def left(): this.type = js.native
    def moveBackwards(): this.type = js.native
    def moveBackwards(layers: Double): this.type = js.native
    def moveForward(): this.type = js.native
    def moveForward(layers: Double): this.type = js.native
    def right(): this.type = js.native
    def rotateDeg(deg: Double): this.type = js.native
    def scale(factor: Double): this.type = js.native
    def toJSON(): js.Any = js.native
    def top(): this.type = js.native
  }
  
}

