package typings
package laddaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ILaddaButton extends js.Object {
  def disable(): ILaddaButton
  def enable(): ILaddaButton
  def isLoading(): scala.Boolean
  def remove(): scala.Unit
  def setProgress(progress: scala.Double): ILaddaButton
  def start(): ILaddaButton
  def startAfter(delay: scala.Double): ILaddaButton
  def stop(): ILaddaButton
  def toggle(): ILaddaButton
}

