package typings.matchdep

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("matchdep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filter(pattern: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def filter(pattern: String, config: FilterConfig): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(pattern.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def filter(pattern: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def filter(pattern: js.Array[String], config: FilterConfig): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(pattern.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def filterAll(pattern: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterAll")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def filterAll(pattern: String, config: FilterConfig): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterAll")(pattern.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def filterAll(pattern: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterAll")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def filterAll(pattern: js.Array[String], config: FilterConfig): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterAll")(pattern.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def filterDev(pattern: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterDev")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def filterDev(pattern: String, config: FilterConfig): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterDev")(pattern.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def filterDev(pattern: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterDev")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def filterDev(pattern: js.Array[String], config: FilterConfig): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterDev")(pattern.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def filterPeer(pattern: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterPeer")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def filterPeer(pattern: String, config: FilterConfig): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterPeer")(pattern.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def filterPeer(pattern: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterPeer")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def filterPeer(pattern: js.Array[String], config: FilterConfig): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterPeer")(pattern.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  type FilterConfig = String | js.Object
  
  type FilterFunction = js.Function2[
    /* pattern */ String | js.Array[String], 
    /* config */ js.UndefOr[FilterConfig], 
    js.Array[String]
  ]
}
