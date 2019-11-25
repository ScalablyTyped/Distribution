package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionic.ionicStrings.GET
  - typings.ionic.ionicStrings.POST
  - typings.ionic.ionicStrings.PATCH
  - typings.ionic.ionicStrings.PUT
  - typings.ionic.ionicStrings.DELETE
  - typings.ionic.ionicStrings.PURGE
  - typings.ionic.ionicStrings.HEAD
  - typings.ionic.ionicStrings.OPTIONS
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typings.ionic.ionicStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.ionic.ionicStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typings.ionic.ionicStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typings.ionic.ionicStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typings.ionic.ionicStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.ionic.ionicStrings.POST = this.cast("POST")
  @scala.inline
  def PURGE: typings.ionic.ionicStrings.PURGE = this.cast("PURGE")
  @scala.inline
  def PUT: typings.ionic.ionicStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

