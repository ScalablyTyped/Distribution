package typings.hexRgb.mod

import typings.hexRgb.anon.Optionsformatarray
import typings.hexRgb.anon.Optionsformatcss
import typings.hexRgb.anon.Optionsformatobject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hex-rgb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  Convert HEX color to RGBA.
  @param hex - The color in HEX format. Leading `#` is optional.
  @example
  ```
  import hexRgb = require('hex-rgb');
  hexRgb('4183c4');
  //=> {red: 65, green: 131, blue: 196, alpha: 1}
  hexRgb('#4183c4');
  //=> {red: 65, green: 131, blue: 196, alpha: 1}
  hexRgb('#fff');
  //=> {red: 255, green: 255, blue: 255, alpha: 1}
  hexRgb('#22222299');
  //=> {red: 34, green: 34, blue: 34, alpha: 0.6}
  hexRgb('#0006');
  //=> {red: 0, green: 0, blue: 0, alpha: 0.4}
  hexRgb('#cd2222cc');
  //=> {red: 205, green: 34, blue: 34, alpha: 0.8}
  hexRgb('#cd2222cc', {format: 'array'});
  //=> [205, 34, 34, 0.8]
  hexRgb('#cd2222cc', {format: 'css'});
  //=> 'rgb(205 34 34 / 80%)'
  hexRgb('#000', {format: 'css'});
  //=> 'rgb(0 0 0)'
  ```
  */
  def apply(hex: String): RgbaObject = js.native
  def apply(hex: String, options: Optionsformatarray): RgbaTuple = js.native
  def apply(hex: String, options: Optionsformatcss): String = js.native
  def apply(hex: String, options: Optionsformatobject): RgbaObject = js.native
}
