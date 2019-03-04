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
  def commit(): js.Promise[scala.Unit]
  /**
    * internal logic of `ctx.session`
    */
  def get(): Session
  /**
    * init session from external store
    * will be called in the front of session middleware
    */
  def initFromExternal(): js.Promise[scala.Unit]
  /**
    * internal logic of `ctx.session=`
    */
  def set(`val`: js.Any): scala.Unit
}

object ContextSession {
  @scala.inline
  def apply(
    app: js.Any,
    commit: js.Function0[js.Promise[scala.Unit]],
    ctx: koaDashSessionLib.koaDashSessionMod.koaMod.Context,
    get: js.Function0[Session],
    initFromExternal: js.Function0[js.Promise[scala.Unit]],
    opts: opts,
    prevHash: java.lang.String,
    session: Session | koaDashSessionLib.koaDashSessionLibNumbers.`false`,
    set: js.Function1[js.Any, scala.Unit],
    store: stores
  ): ContextSession = {
    val __obj = js.Dynamic.literal(app = app, commit = commit, ctx = ctx, get = get, initFromExternal = initFromExternal, opts = opts, prevHash = prevHash, session = session.asInstanceOf[js.Any], set = set, store = store)
  
    __obj.asInstanceOf[ContextSession]
  }
}

