package typings
package jsDashFixturesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fixtures extends js.Object {
  var containerId: java.lang.String
  var path: java.lang.String
  def appendLoad(urls: java.lang.String*): scala.Unit
  def appendSet(html: java.lang.String): scala.Unit
  def body(): java.lang.String
  def cleanUp(): scala.Unit
  def clearCache(): scala.Unit
  def load(urls: java.lang.String*): scala.Unit
  def preload(urls: java.lang.String*): scala.Unit
  def read(urls: java.lang.String*): java.lang.String
  def set(html: java.lang.String): scala.Unit
  def window(): stdLib.Window
}

