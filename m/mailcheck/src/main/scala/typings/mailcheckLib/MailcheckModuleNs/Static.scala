package typings
package mailcheckLib.MailcheckModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  var defaultDomains: js.Array[java.lang.String] = js.native
  var defaultSecondLevelDomains: js.Array[java.lang.String] = js.native
  var defaultTopLevelDomains: js.Array[java.lang.String] = js.native
  var domainThreshold: scala.Double = js.native
  @JSName("suggest")
  var suggest_Original: ISuggestFunction = js.native
  var topLevelThreshold: scala.Double = js.native
  def encodeEmail(email: java.lang.String): java.lang.String = js.native
  def findClosestDomain(domain: java.lang.String, domains: js.Array[java.lang.String]): scala.Boolean | java.lang.String = js.native
  def findClosestDomain(domain: java.lang.String, domains: js.Array[java.lang.String], distanceFunction: IDistanceFunction): scala.Boolean | java.lang.String = js.native
  def findClosestDomain(
    domain: java.lang.String,
    domains: js.Array[java.lang.String],
    distanceFunction: IDistanceFunction,
    threshold: scala.Double
  ): scala.Boolean | java.lang.String = js.native
  def run(opts: IOptions): scala.Unit = js.native
  def sift3Distance(s1: java.lang.String, s2: java.lang.String): scala.Double = js.native
  def splitEmail(email: java.lang.String): ISplitEmail = js.native
  def suggest(email: java.lang.String): scala.Unit = js.native
  def suggest(email: java.lang.String, domains: js.Array[java.lang.String]): scala.Unit = js.native
  def suggest(
    email: java.lang.String,
    domains: js.Array[java.lang.String],
    topLevelDomains: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def suggest(
    email: java.lang.String,
    domains: js.Array[java.lang.String],
    topLevelDomains: js.Array[java.lang.String],
    distanceFunction: IDistanceFunction
  ): scala.Unit = js.native
}

