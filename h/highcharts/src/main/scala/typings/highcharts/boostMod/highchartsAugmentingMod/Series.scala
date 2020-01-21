package typings.highcharts.boostMod.highchartsAugmentingMod

import typings.highcharts.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Series extends js.Object {
  /**
    * If implemented in the core, parts of this can probably be shared with
    * other similar methods in Highcharts.
    */
  def destroyGraphics(): Unit = js.native
  /**
    * Enter boost mode and apply boost-specific properties.
    */
  def enterBoost(): Unit = js.native
  /**
    * Exit from boost mode and restore non-boost properties.
    */
  def exitBoost(): Unit = js.native
  /**
    * Return a full Point object based on the index. The boost module uses
    * stripped point objects for performance reasons.
    *
    * @param boostPoint
    *        A stripped-down point object
    *
    * @return A Point object as per
    *         http://api.highcharts.com/highcharts#Point
    */
  def getPoint(boostPoint: js.Object): Point = js.native
  def getPoint(boostPoint: Point): Point = js.native
}

