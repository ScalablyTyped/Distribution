package typings.graphqlToolsGraphqlTagPluck.mod

import typings.graphqlToolsGraphqlTagPluck.anon.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLTagPluckOptions extends js.Object {
  /**
    * Allows to use a global identifier instead of a module import.
    * ```js
    * // `graphql` is a global function
    * export const usersQuery = graphql`
    *   {
    *     users {
    *       id
    *       name
    *     }
    *   }
    * `;
    * ```
    */
  var globalGqlIdentifierName: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The magic comment anchor to look for when parsing GraphQL strings. Defaults to `graphql`.
    */
  var gqlMagicComment: js.UndefOr[String] = js.native
  /**
    * Additional options for determining how a file is parsed.An array of packages that are responsible for exporting the GraphQL string parser function. The following modules are supported by default:
    * ```js
    * {
    *   modules: [
    *     {
    *       // import gql from 'graphql-tag'
    *       name: 'graphql-tag',
    *     },
    *     {
    *       name: 'graphql-tag.macro',
    *     },
    *     {
    *       // import { graphql } from 'gatsby'
    *       name: 'gatsby',
    *       identifier: 'graphql',
    *     },
    *     {
    *       name: 'apollo-server-express',
    *       identifier: 'gql',
    *     },
    *     {
    *       name: 'apollo-server',
    *       identifier: 'gql',
    *     },
    *     {
    *       name: 'react-relay',
    *       identifier: 'graphql',
    *     },
    *     {
    *       name: 'apollo-boost',
    *       identifier: 'gql',
    *     },
    *     {
    *       name: 'apollo-server-koa',
    *       identifier: 'gql',
    *     },
    *     {
    *       name: 'apollo-server-hapi',
    *       identifier: 'gql',
    *     },
    *     {
    *       name: 'apollo-server-fastify',
    *       identifier: 'gql',
    *     },
    *     {
    *       name: ' apollo-server-lambda',
    *       identifier: 'gql',
    *     },
    *     {
    *       name: 'apollo-server-micro',
    *       identifier: 'gql',
    *     },
    *     {
    *       name: 'apollo-server-azure-functions',
    *       identifier: 'gql',
    *     },
    *     {
    *       name: 'apollo-server-cloud-functions',
    *       identifier: 'gql',
    *     },
    *     {
    *       name: 'apollo-server-cloudflare',
    *       identifier: 'gql',
    *     },
    *   ];
    * }
    * ```
    */
  var modules: js.UndefOr[js.Array[Identifier]] = js.native
}

object GraphQLTagPluckOptions {
  @scala.inline
  def apply(): GraphQLTagPluckOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLTagPluckOptions]
  }
  @scala.inline
  implicit class GraphQLTagPluckOptionsOps[Self <: GraphQLTagPluckOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGlobalGqlIdentifierNameVarargs(value: String*): Self = this.set("globalGqlIdentifierName", js.Array(value :_*))
    @scala.inline
    def setGlobalGqlIdentifierName(value: String | js.Array[String]): Self = this.set("globalGqlIdentifierName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalGqlIdentifierName: Self = this.set("globalGqlIdentifierName", js.undefined)
    @scala.inline
    def setGqlMagicComment(value: String): Self = this.set("gqlMagicComment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGqlMagicComment: Self = this.set("gqlMagicComment", js.undefined)
    @scala.inline
    def setModulesVarargs(value: Identifier*): Self = this.set("modules", js.Array(value :_*))
    @scala.inline
    def setModules(value: js.Array[Identifier]): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
  }
  
}

