package typings
package graphqlDashComposeLib.libResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverOpts[TSource, TContext, TArgs] extends js.Object {
  var args: js.UndefOr[graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigArgumentMap[TArgs]] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[ResolverKinds] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[Resolver[TSource, TContext, TArgs]] = js.undefined
  var resolve: js.UndefOr[ResolverRpCb[TSource, TContext, TArgs]] = js.undefined
  var `type`: js.UndefOr[graphqlDashComposeLib.libTypeComposerMod.ComposeOutputType[TSource, TContext, _]] = js.undefined
}

object ResolverOpts {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    args: graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigArgumentMap[TArgs] = null,
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    kind: ResolverKinds = null,
    name: java.lang.String = null,
    parent: Resolver[TSource, TContext, TArgs] = null,
    resolve: ResolverRpCb[TSource, TContext, TArgs] = null,
    `type`: graphqlDashComposeLib.libTypeComposerMod.ComposeOutputType[TSource, TContext, _] = null
  ): ResolverOpts[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverOpts[TSource, TContext, TArgs]]
  }
}

