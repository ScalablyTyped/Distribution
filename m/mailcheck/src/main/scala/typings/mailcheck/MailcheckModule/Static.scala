package typings.mailcheck.MailcheckModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  var defaultDomains: js.Array[String] = js.native
  var defaultSecondLevelDomains: js.Array[String] = js.native
  var defaultTopLevelDomains: js.Array[String] = js.native
  var domainThreshold: Double = js.native
  @JSName("suggest")
  var suggest_Original: ISuggestFunction = js.native
  var topLevelThreshold: Double = js.native
  def encodeEmail(email: String): String = js.native
  def findClosestDomain(domain: String, domains: js.Array[String]): Boolean | String = js.native
  def findClosestDomain(domain: String, domains: js.Array[String], distanceFunction: IDistanceFunction): Boolean | String = js.native
  def findClosestDomain(domain: String, domains: js.Array[String], distanceFunction: IDistanceFunction, threshold: Double): Boolean | String = js.native
  def run(opts: IOptions): Unit = js.native
  def sift3Distance(s1: String, s2: String): Double = js.native
  def splitEmail(email: String): ISplitEmail = js.native
  def suggest(email: String): Unit = js.native
  def suggest(email: String, domains: js.Array[String]): Unit = js.native
  def suggest(email: String, domains: js.Array[String], topLevelDomains: js.Array[String]): Unit = js.native
  def suggest(
    email: String,
    domains: js.Array[String],
    topLevelDomains: js.Array[String],
    distanceFunction: IDistanceFunction
  ): Unit = js.native
}

