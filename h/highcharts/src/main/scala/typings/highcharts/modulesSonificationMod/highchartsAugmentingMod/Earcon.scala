package typings.highcharts.modulesSonificationMod.highchartsAugmentingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Earcon class. Earcon objects represent a certain sound consisting of
  * one or more instruments playing a predefined sound.
  */
@js.native
trait Earcon extends StObject {
  
  /**
    * Cancel any current sonification of the Earcon. Calls onEnd functions.
    *
    * @param fadeOut
    *        Whether or not to fade out as we stop. If false, the earcon is
    *        cancelled synchronously.
    */
  def cancelSonify(): Unit = js.native
  def cancelSonify(fadeOut: Boolean): Unit = js.native
  
  /**
    * Play the earcon, optionally overriding init options.
    *
    * @param options
    *        Override existing options.
    */
  def sonify(options: EarconOptionsObject): Unit = js.native
}
