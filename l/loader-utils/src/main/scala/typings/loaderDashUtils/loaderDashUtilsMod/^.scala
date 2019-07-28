package typings.loaderDashUtils.loaderDashUtilsMod

import typings.node.Buffer
import typings.webpack.webpackMod.loaderNs.LoaderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loader-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCurrentRequest(loaderContext: LoaderContext): String = js.native
  def getHashDigest(buffer: Buffer, hashType: HashType, digestType: DigestType, maxLength: Double): String = js.native
  def getOptions(loaderContext: LoaderContext): OptionObject = js.native
  def getRemainingRequest(loaderContext: LoaderContext): String = js.native
  def interpolateName(loaderContext: LoaderContext, name: String): String = js.native
  def interpolateName(loaderContext: LoaderContext, name: String, options: js.Any): String = js.native
  def isUrlRequest(url: String): Boolean = js.native
  def isUrlRequest(url: String, root: String): Boolean = js.native
  def parseQuery(optionString: String): OptionObject = js.native
  def parseString(str: String): String = js.native
  def stringifyRequest(loaderContext: LoaderContext, resource: String): String = js.native
  def urlToRequest(url: String): String = js.native
  def urlToRequest(url: String, root: String): String = js.native
}

