package typings
package h2o2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object h2o2LibStrings {
  @js.native
  sealed trait http extends js.Object
  
  @js.native
  sealed trait https extends js.Object
  
  @js.native
  sealed trait upstream extends js.Object
  
  def http: http = "http".asInstanceOf[http]
  def https: https = "https".asInstanceOf[https]
  def upstream: upstream = "upstream".asInstanceOf[upstream]
}

