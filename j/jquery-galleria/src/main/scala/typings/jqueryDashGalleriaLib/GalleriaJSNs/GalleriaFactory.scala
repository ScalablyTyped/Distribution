package typings
package jqueryDashGalleriaLib.GalleriaJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GalleriaFactory extends js.Object {
  def configure(options: GalleriaOptions): GalleriaFactory = js.native
  def load(data: js.Array[GalleriaEntry]): GalleriaFactory = js.native
  def loadTheme(url: java.lang.String): GalleriaFactory = js.native
  def ready(method: js.Function0[_]): scala.Unit = js.native
  def refreshImage(): GalleriaFactory = js.native
  def resize(): GalleriaFactory = js.native
  def run(): GalleriaFactory = js.native
  def run(selector: java.lang.String): GalleriaFactory = js.native
  def run(selector: java.lang.String, options: GalleriaOptions): GalleriaFactory = js.native
  def setOptions(options: GalleriaOptions): GalleriaFactory = js.native
}

