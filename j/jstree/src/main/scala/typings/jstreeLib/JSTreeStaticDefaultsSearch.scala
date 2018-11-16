package typings
package jstreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JSTreeStaticDefaultsSearch extends js.Object {
  /**
      * a jQuery-like AJAX config, which jstree uses if a server should be queried for results.
      *
      * A `str` (which is the search string) parameter will be added with the request,
      * an optional `inside` parameter will be added if the search is limited to a node id.
      * The expected result is a JSON array with nodes that need to be opened so that matching nodes will be revealed.
      * Leave this setting as `false` to not query the server. You can also set this to a function,
      * which will be invoked in the instance's scope and receive 3 parameters - the search string,
      * the callback to call with the array of nodes to load, and the optional node ID to limit the search to
      * @name $.jstree.defaults.search.ajax
      * @plugin search
      */
  var ajax: js.Any
  /**
      * Indicates if the search should be case sensitive. Default is `false`.
      * @name $.jstree.defaults.search.case_sensitive
      * @plugin search
      */
  var case_sensitive: scala.Boolean
  /**
      * Indicates if all nodes opened to reveal the search result,
      * should be closed when the search is cleared or a new search is performed. Default is `true`.
      * @name $.jstree.defaults.search.close_opened_onclear
      * @plugin search
      */
  var close_opened_onclear: scala.Boolean
  /**
      * Indicates if the search should be fuzzy or not (should `chnd3` match `child node 3`). Default is `true`.
      * @name $.jstree.defaults.search.fuzzy
      * @plugin search
      */
  var fuzzy: scala.Boolean
  /**
      * If set to a function it wil be called in the instance's scope with two arguments -
      * search string and node (where node will be every node in the structure, so use with caution).
      * If the function returns a truthy value the node will be considered a match
      * (it might not be displayed if search_only_leaves is set to true and the node is not a leaf). Default is `false`.
      * @name $.jstree.defaults.search.search_callback
      * @plugin search
      */
  var search_callback: js.Any
  /**
      * Indicates if only leaf nodes should be included in search results. Default is `false`.
      * @name $.jstree.defaults.search.search_leaves_only
      * @plugin search
      */
  var search_leaves_only: scala.Boolean
  /**
      * Indicates if the tree should be filtered (by default) to show only matching nodes
      * (keep in mind this can be a heavy on large trees in old browsers).
      * This setting can be changed at runtime when calling the search method. Default is `false`.
      * @name $.jstree.defaults.search.show_only_matches
      * @plugin search
      */
  var show_only_matches: scala.Boolean
  /**
  	* Indicates if the children of matched element are shown (when show_only_matches is true)
  	* This setting can be changed at runtime when calling the search method. Default is `false`.
  	* @name $.jstree.defaults.search.show_only_matches_children
  	* @plugin search
  	*/
  var show_only_matches_children: scala.Boolean
}

