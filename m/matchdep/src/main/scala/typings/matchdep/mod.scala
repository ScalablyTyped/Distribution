package typings.matchdep

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("matchdep", "filter")
  @js.native
  def filter(pattern: String): js.Array[String] = js.native
  @JSImport("matchdep", "filter")
  @js.native
  def filter(pattern: String, config: FilterConfig): js.Array[String] = js.native
  @JSImport("matchdep", "filter")
  @js.native
  def filter(pattern: js.Array[String]): js.Array[String] = js.native
  @JSImport("matchdep", "filter")
  @js.native
  def filter(pattern: js.Array[String], config: FilterConfig): js.Array[String] = js.native
  
  @JSImport("matchdep", "filterAll")
  @js.native
  def filterAll(pattern: String): js.Array[String] = js.native
  @JSImport("matchdep", "filterAll")
  @js.native
  def filterAll(pattern: String, config: FilterConfig): js.Array[String] = js.native
  @JSImport("matchdep", "filterAll")
  @js.native
  def filterAll(pattern: js.Array[String]): js.Array[String] = js.native
  @JSImport("matchdep", "filterAll")
  @js.native
  def filterAll(pattern: js.Array[String], config: FilterConfig): js.Array[String] = js.native
  
  @JSImport("matchdep", "filterDev")
  @js.native
  def filterDev(pattern: String): js.Array[String] = js.native
  @JSImport("matchdep", "filterDev")
  @js.native
  def filterDev(pattern: String, config: FilterConfig): js.Array[String] = js.native
  @JSImport("matchdep", "filterDev")
  @js.native
  def filterDev(pattern: js.Array[String]): js.Array[String] = js.native
  @JSImport("matchdep", "filterDev")
  @js.native
  def filterDev(pattern: js.Array[String], config: FilterConfig): js.Array[String] = js.native
  
  @JSImport("matchdep", "filterPeer")
  @js.native
  def filterPeer(pattern: String): js.Array[String] = js.native
  @JSImport("matchdep", "filterPeer")
  @js.native
  def filterPeer(pattern: String, config: FilterConfig): js.Array[String] = js.native
  @JSImport("matchdep", "filterPeer")
  @js.native
  def filterPeer(pattern: js.Array[String]): js.Array[String] = js.native
  @JSImport("matchdep", "filterPeer")
  @js.native
  def filterPeer(pattern: js.Array[String], config: FilterConfig): js.Array[String] = js.native
  
  type FilterConfig = String | js.Object
  
  type FilterFunction = js.Function2[
    /* pattern */ String | js.Array[String], 
    /* config */ js.UndefOr[FilterConfig], 
    js.Array[String]
  ]
}
