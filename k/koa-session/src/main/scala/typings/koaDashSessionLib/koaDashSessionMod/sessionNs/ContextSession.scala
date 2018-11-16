package typings
package koaDashSessionLib.koaDashSessionMod.sessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContextSession extends js.Object {
  var app: js.Any
  var ctx: koaDashSessionLib.koaDashSessionMod.koaMod.Context
  var opts: opts
  var prevHash: java.lang.String
  var session: Session | koaDashSessionLib.koaDashSessionLibNumbers.`false`
  var store: stores
  /**
           * Commit the session changes or removal.
           */
  def commit(): stdLib.Promise[scala.Unit]
  /**
           * internal logic of `ctx.session`
           */
  def get(): Session
  /**
           * init session from external store
           * will be called in the front of session middleware
           */
  def initFromExternal(): stdLib.Promise[scala.Unit]
  /**
           * internal logic of `ctx.session=`
           */
  def set(`val`: js.Any): scala.Unit
}

