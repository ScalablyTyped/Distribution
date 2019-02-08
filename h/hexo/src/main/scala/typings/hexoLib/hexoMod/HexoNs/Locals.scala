package typings
package hexoLib.hexoMod.HexoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locals extends js.Object {
  /**
    * Get a Variable
    */
  def get(`type`: java.lang.String): js.Any = js.native
  @JSName("get")
  def get_categories(`type`: hexoLib.hexoLibStrings.categories): hexoLib.hexoMod.Model[hexoLib.hexoMod.HexoNs.LocalsNs.Category] = js.native
  @JSName("get")
  def get_pages(`type`: hexoLib.hexoLibStrings.pages): hexoLib.hexoMod.Model[hexoLib.hexoMod.HexoNs.LocalsNs.Page] = js.native
  @JSName("get")
  def get_posts(`type`: hexoLib.hexoLibStrings.posts): hexoLib.hexoMod.Model[hexoLib.hexoMod.HexoNs.LocalsNs.Post] = js.native
  @JSName("get")
  def get_tags(`type`: hexoLib.hexoLibStrings.tags): hexoLib.hexoMod.Model[hexoLib.hexoMod.HexoNs.LocalsNs.Tag] = js.native
  /**
    * Invalidate the cache
    */
  def invalidate(): this.type = js.native
  /**
    * Remove a Variable
    */
  def remove(`type`: java.lang.String): this.type = js.native
  /**
    * Set a Variable
    */
  def set(`type`: java.lang.String, fn: js.Function0[_]): this.type = js.native
  /**
    * Get All Variable
    */
  def toObject(): js.Any = js.native
}

