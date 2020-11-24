package typings.inkBigText.mod

import typings.inkBigText.inkBigTextStrings.`3d`
import typings.inkBigText.inkBigTextStrings.black
import typings.inkBigText.inkBigTextStrings.block
import typings.inkBigText.inkBigTextStrings.blue
import typings.inkBigText.inkBigTextStrings.center
import typings.inkBigText.inkBigTextStrings.chrome
import typings.inkBigText.inkBigTextStrings.cyan
import typings.inkBigText.inkBigTextStrings.green
import typings.inkBigText.inkBigTextStrings.grid
import typings.inkBigText.inkBigTextStrings.huge
import typings.inkBigText.inkBigTextStrings.left
import typings.inkBigText.inkBigTextStrings.magenta
import typings.inkBigText.inkBigTextStrings.pallet
import typings.inkBigText.inkBigTextStrings.red
import typings.inkBigText.inkBigTextStrings.right
import typings.inkBigText.inkBigTextStrings.shade
import typings.inkBigText.inkBigTextStrings.simple
import typings.inkBigText.inkBigTextStrings.simple3d
import typings.inkBigText.inkBigTextStrings.simpleBlock
import typings.inkBigText.inkBigTextStrings.slick
import typings.inkBigText.inkBigTextStrings.tiny
import typings.inkBigText.inkBigTextStrings.transparent
import typings.inkBigText.inkBigTextStrings.white
import typings.inkBigText.inkBigTextStrings.yellow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// note: BigTextProps.colors are based on cfonts (https://github.com/dominikwilkowski/cfonts). I will have commented out
// some of the accepted inputs. Becuase it also allows for hex colors, I decided to not narrow it down
// from a string type. A regex would be VERY useful here, but is unfortunately unsupported
// (see this issue: https://github.com/Microsoft/TypeScript/issues/6579). I will happily update this type if
// this feature ever gets added! That way the colors[] will be typed as any of the accepted colors OR a valid hex color.
// However until then, the type will be string.
// The official cfont docs state the following would be accepted (in addition to any valid hex):
// type DefinedColors =
//     | 'system'
//     | 'black'
//     | 'red'
//     | 'green'
//     | 'yellow'
//     | 'blue'
//     | 'magenta'
//     | 'cyan'
//     | 'white'
//     | 'gray'
//     | 'redBright'
//     | 'greenBright'
//     | 'yellowBright'
//     | 'blueBright'
//     | 'magentaBright'
//     | 'cyanBright'
//     | 'whiteBright';
@js.native
trait BigTextProps extends js.Object {
  
  var align: js.UndefOr[left | center | right] = js.native
  
  var backgroundColor: js.UndefOr[transparent | black | red | green | yellow | blue | magenta | cyan | white] = js.native
  
  var colors: js.UndefOr[js.Array[String]] = js.native
  
  var font: js.UndefOr[
    block | slick | tiny | grid | pallet | shade | simple | simpleBlock | `3d` | simple3d | chrome | huge
  ] = js.native
  
  var letterSpacing: js.UndefOr[Double] = js.native
  
  var lineHeight: js.UndefOr[Double] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  var space: js.UndefOr[Boolean] = js.native
  
  var text: String = js.native
}
object BigTextProps {
  
  @scala.inline
  def apply(text: String): BigTextProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigTextProps]
  }
  
  @scala.inline
  implicit class BigTextPropsOps[Self <: BigTextProps] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlign(value: left | center | right): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: transparent | black | red | green | yellow | blue | magenta | cyan | white): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setFont(
      value: block | slick | tiny | grid | pallet | shade | simple | simpleBlock | `3d` | simple3d | chrome | huge
    ): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: Double): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setSpace(value: Boolean): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
  }
}
