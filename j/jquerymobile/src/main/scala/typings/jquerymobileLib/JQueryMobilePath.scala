package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryMobilePath extends js.Object {
  def get(url: java.lang.String): java.lang.String = js.native
  def getDocumentBase(): js.Any = js.native
  def getDocumentBase(asParsedObject: scala.Boolean): js.Any = js.native
  def getDocumentUrl(): js.Any = js.native
  def getDocumentUrl(asParsedObject: scala.Boolean): js.Any = js.native
  def getLocation(): java.lang.String = js.native
  def isAbsoluteUrl(url: java.lang.String): scala.Boolean = js.native
  def isRelativeUrl(url: java.lang.String): scala.Boolean = js.native
  def makeUrlAbsolute(relUrl: java.lang.String, absUrl: java.lang.String): java.lang.String = js.native
  def parseLocation(): ParsedPath = js.native
  def parseUrl(url: java.lang.String): ParsedPath = js.native
}

