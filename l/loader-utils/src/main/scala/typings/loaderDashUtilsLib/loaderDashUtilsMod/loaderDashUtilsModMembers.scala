package typings
package loaderDashUtilsLib.loaderDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loader-utils", JSImport.Namespace)
@js.native
object loaderDashUtilsModMembers extends js.Object {
  def getCurrentRequest(loaderContext: webpackLib.webpackMod.webpackNs.loaderNs.LoaderContext): java.lang.String = js.native
  def getHashDigest(buffer: nodeLib.Buffer, hashType: HashType, digestType: DigestType, maxLength: scala.Double): java.lang.String = js.native
  def getOptions(loaderContext: webpackLib.webpackMod.webpackNs.loaderNs.LoaderContext): OptionObject = js.native
  def getRemainingRequest(loaderContext: webpackLib.webpackMod.webpackNs.loaderNs.LoaderContext): java.lang.String = js.native
  def interpolateName(loaderContext: webpackLib.webpackMod.webpackNs.loaderNs.LoaderContext, name: java.lang.String): java.lang.String = js.native
  def interpolateName(
    loaderContext: webpackLib.webpackMod.webpackNs.loaderNs.LoaderContext,
    name: java.lang.String,
    options: js.Any
  ): java.lang.String = js.native
  def isUrlRequest(url: java.lang.String): scala.Boolean = js.native
  def isUrlRequest(url: java.lang.String, root: java.lang.String): scala.Boolean = js.native
  def parseQuery(optionString: java.lang.String): OptionObject = js.native
  def parseString(str: java.lang.String): java.lang.String = js.native
  def stringifyRequest(loaderContext: webpackLib.webpackMod.webpackNs.loaderNs.LoaderContext, resource: java.lang.String): java.lang.String = js.native
  def urlToRequest(url: java.lang.String): java.lang.String = js.native
  def urlToRequest(url: java.lang.String, root: java.lang.String): java.lang.String = js.native
}

