package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofndb_mongodb extends js.Object {
  def exec(
    ssrv: java.lang.String,
    sdname: java.lang.String,
    scname: java.lang.String,
    scmd: java.lang.String,
    sres: java.lang.String
  ): scala.Double
  def exec_simple(
    ssrv: java.lang.String,
    sdname: java.lang.String,
    scname: java.lang.String,
    scmd: java.lang.String,
    sres: java.lang.String
  ): scala.Double
  def find(
    ssrv: java.lang.String,
    sdname: java.lang.String,
    scname: java.lang.String,
    scmd: java.lang.String,
    sres: java.lang.String
  ): scala.Double
  def find_one(
    ssrv: java.lang.String,
    sdname: java.lang.String,
    scname: java.lang.String,
    scmd: java.lang.String,
    sres: java.lang.String
  ): scala.Double
  def free_reply(name: java.lang.String): scala.Double
  def next_reply(name: java.lang.String): scala.Double
}

object Typeofndb_mongodb {
  @scala.inline
  def apply(
    exec: (java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    exec_simple: (java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    find: (java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    find_one: (java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    free_reply: java.lang.String => scala.Double,
    next_reply: java.lang.String => scala.Double
  ): Typeofndb_mongodb = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction5(exec), exec_simple = js.Any.fromFunction5(exec_simple), find = js.Any.fromFunction5(find), find_one = js.Any.fromFunction5(find_one), free_reply = js.Any.fromFunction1(free_reply), next_reply = js.Any.fromFunction1(next_reply))
  
    __obj.asInstanceOf[Typeofndb_mongodb]
  }
}

