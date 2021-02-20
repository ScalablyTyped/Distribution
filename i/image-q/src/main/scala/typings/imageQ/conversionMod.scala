package typings.imageQ

import typings.imageQ.anon.A
import typings.imageQ.anon.B
import typings.imageQ.anon.H
import typings.imageQ.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conversionMod {
  
  @JSImport("image-q/dist/conversion", "lab2rgb")
  @js.native
  def lab2rgb(L: Double, a: Double, b: Double): B = js.native
  
  @JSImport("image-q/dist/conversion", "lab2xyz")
  @js.native
  def lab2xyz(L: Double, a: Double, b: Double): X = js.native
  
  @JSImport("image-q/dist/conversion", "rgb2hsl")
  @js.native
  def rgb2hsl(r: Double, g: Double, b: Double): H = js.native
  
  @JSImport("image-q/dist/conversion", "rgb2lab")
  @js.native
  def rgb2lab(r: Double, g: Double, b: Double): A = js.native
  
  @JSImport("image-q/dist/conversion", "rgb2xyz")
  @js.native
  def rgb2xyz(r: Double, g: Double, b: Double): X = js.native
  
  @JSImport("image-q/dist/conversion", "xyz2lab")
  @js.native
  def xyz2lab(x: Double, y: Double, z: Double): A = js.native
  
  @JSImport("image-q/dist/conversion", "xyz2rgb")
  @js.native
  def xyz2rgb(x: Double, y: Double, z: Double): B = js.native
}
