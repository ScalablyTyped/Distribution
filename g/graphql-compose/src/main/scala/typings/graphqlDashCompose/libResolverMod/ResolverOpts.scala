package typings.graphqlDashCompose.libResolverMod

import typings.graphqlDashCompose.libObjectTypeComposerMod.ComposeFieldConfigArgumentMap
import typings.graphqlDashCompose.libObjectTypeComposerMod.ComposeOutputType
import typings.graphqlDashCompose.libUtilsDefinitionsMod.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverOpts[TSource, TContext, TArgs, TReturn] extends js.Object {
  var args: js.UndefOr[ComposeFieldConfigArgumentMap[TArgs]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var extensions: js.UndefOr[Extensions] = js.undefined
  var kind: js.UndefOr[ResolverKinds] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[Resolver[_, TContext, _, _]] = js.undefined
  var resolve: js.UndefOr[ResolverRpCb[TSource, TContext, TArgs]] = js.undefined
  var `type`: js.UndefOr[ComposeOutputType[TReturn, TContext]] = js.undefined
}

object ResolverOpts {
  @scala.inline
  def apply[TSource, TContext, TArgs, TReturn](
    args: ComposeFieldConfigArgumentMap[TArgs] = null,
    description: String = null,
    displayName: String = null,
    extensions: Extensions = null,
    kind: ResolverKinds = null,
    name: String = null,
    parent: Resolver[_, TContext, _, _] = null,
    resolve: /* resolveParams */ ResolveParams[TSource, TContext, TArgs] => js.Promise[js.Any] | js.Any = null,
    `type`: ComposeOutputType[TReturn, TContext] = null
  ): ResolverOpts[TSource, TContext, TArgs, TReturn] = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction1(resolve))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverOpts[TSource, TContext, TArgs, TReturn]]
  }
}

