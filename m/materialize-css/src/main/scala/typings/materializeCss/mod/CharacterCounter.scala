package typings.materializeCss.mod

import typings.materializeCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "CharacterCounter")
@js.native
class CharacterCounter ()
  extends typings.materializeCss.M.CharacterCounter

/* static members */
@JSImport("materialize-css", "CharacterCounter")
@js.native
object CharacterCounter extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.CharacterCounter = js.native
  /**
    * Init CharacterCounters
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.CharacterCounter] = js.native
  def init(els: MElements, options: Partial[js.UndefOr[scala.Nothing]]): js.Array[typings.materializeCss.M.CharacterCounter] = js.native
  /**
    * Init CharacterCounter
    */
  def init(els: Element): typings.materializeCss.M.CharacterCounter = js.native
  def init(els: Element, options: Partial[js.UndefOr[scala.Nothing]]): typings.materializeCss.M.CharacterCounter = js.native
}

