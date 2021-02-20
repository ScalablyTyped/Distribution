package typings.instagramPrivateApi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instaStickerMod {
  
  @JSImport("instagram-private-api/dist/sticker-builder/stickers/insta-sticker", "InstaSticker")
  @js.native
  abstract class InstaSticker () extends StObject {
    
    def additionalConfigureProperties: js.Any = js.native
    
    def bottom(): this.type = js.native
    
    def center(): this.type = js.native
    
    var height: Double = js.native
    
    def id: String = js.native
    
    var isSticker: Boolean = js.native
    
    def key: String = js.native
    
    def left(): this.type = js.native
    
    def moveBackwards(): this.type = js.native
    def moveBackwards(layers: Double): this.type = js.native
    
    def moveForward(): this.type = js.native
    def moveForward(layers: Double): this.type = js.native
    
    def right(): this.type = js.native
    
    def rotateDeg(deg: Double): this.type = js.native
    
    var rotation: Double = js.native
    
    def scale(factor: Double): this.type = js.native
    
    def toJSON(): StringDictionary[js.Any] = js.native
    
    def top(): this.type = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
}
