package typings
package lestateLib.lestateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LeState extends js.Object {
  def createListener(options: lestateLib.Anon_Selector): scala.Unit
  def get(): js.Any
  def getDescription(): js.Object
  def insert(newValue: js.Object): scala.Unit
  def set(newValue: js.Object): js.Array[lestateLib.Anon_State]
}

