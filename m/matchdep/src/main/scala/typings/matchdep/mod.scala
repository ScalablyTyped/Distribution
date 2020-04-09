package typings.matchdep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matchdep", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def filter(pattern: String): js.Array[String] = js.native
  def filter(pattern: String, config: FilterConfig): js.Array[String] = js.native
  def filter(pattern: js.Array[String]): js.Array[String] = js.native
  def filter(pattern: js.Array[String], config: FilterConfig): js.Array[String] = js.native
  def filterAll(pattern: String): js.Array[String] = js.native
  def filterAll(pattern: String, config: FilterConfig): js.Array[String] = js.native
  def filterAll(pattern: js.Array[String]): js.Array[String] = js.native
  def filterAll(pattern: js.Array[String], config: FilterConfig): js.Array[String] = js.native
  def filterDev(pattern: String): js.Array[String] = js.native
  def filterDev(pattern: String, config: FilterConfig): js.Array[String] = js.native
  def filterDev(pattern: js.Array[String]): js.Array[String] = js.native
  def filterDev(pattern: js.Array[String], config: FilterConfig): js.Array[String] = js.native
  def filterPeer(pattern: String): js.Array[String] = js.native
  def filterPeer(pattern: String, config: FilterConfig): js.Array[String] = js.native
  def filterPeer(pattern: js.Array[String]): js.Array[String] = js.native
  def filterPeer(pattern: js.Array[String], config: FilterConfig): js.Array[String] = js.native
  type FilterConfig = String | js.Object
  type FilterFunction = js.Function2[
    /* pattern */ String | js.Array[String], 
    /* config */ js.UndefOr[FilterConfig], 
    js.Array[String]
  ]
}

