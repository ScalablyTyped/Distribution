package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var ajax: js.Any = js.native
  
  /**
    * Indicates if the search should be case sensitive. Default is `false`.
    * @name $.jstree.defaults.search.case_sensitive
    * @plugin search
    */
  var case_sensitive: Boolean = js.native
  
  /**
    * Indicates if all nodes opened to reveal the search result,
    * should be closed when the search is cleared or a new search is performed. Default is `true`.
    * @name $.jstree.defaults.search.close_opened_onclear
    * @plugin search
    */
  var close_opened_onclear: Boolean = js.native
  
  /**
    * Indicates if the search should be fuzzy or not (should `chnd3` match `child node 3`). Default is `true`.
    * @name $.jstree.defaults.search.fuzzy
    * @plugin search
    */
  var fuzzy: Boolean = js.native
  
  /**
    * If set to a function it wil be called in the instance's scope with two arguments -
    * search string and node (where node will be every node in the structure, so use with caution).
    * If the function returns a truthy value the node will be considered a match
    * (it might not be displayed if search_only_leaves is set to true and the node is not a leaf). Default is `false`.
    * @name $.jstree.defaults.search.search_callback
    * @plugin search
    */
  var search_callback: js.Any = js.native
  
  /**
    * Indicates if only leaf nodes should be included in search results. Default is `false`.
    * @name $.jstree.defaults.search.search_leaves_only
    * @plugin search
    */
  var search_leaves_only: Boolean = js.native
  
  /**
    * Indicates if the tree should be filtered (by default) to show only matching nodes
    * (keep in mind this can be a heavy on large trees in old browsers).
    * This setting can be changed at runtime when calling the search method. Default is `false`.
    * @name $.jstree.defaults.search.show_only_matches
    * @plugin search
    */
  var show_only_matches: Boolean = js.native
  
  /**
    * Indicates if the children of matched element are shown (when show_only_matches is true)
    * This setting can be changed at runtime when calling the search method. Default is `false`.
    * @name $.jstree.defaults.search.show_only_matches_children
    * @plugin search
    */
  var show_only_matches_children: Boolean = js.native
}
object JSTreeStaticDefaultsSearch {
  
  @scala.inline
  def apply(
    ajax: js.Any,
    case_sensitive: Boolean,
    close_opened_onclear: Boolean,
    fuzzy: Boolean,
    search_callback: js.Any,
    search_leaves_only: Boolean,
    show_only_matches: Boolean,
    show_only_matches_children: Boolean
  ): JSTreeStaticDefaultsSearch = {
    val __obj = js.Dynamic.literal(ajax = ajax.asInstanceOf[js.Any], case_sensitive = case_sensitive.asInstanceOf[js.Any], close_opened_onclear = close_opened_onclear.asInstanceOf[js.Any], fuzzy = fuzzy.asInstanceOf[js.Any], search_callback = search_callback.asInstanceOf[js.Any], search_leaves_only = search_leaves_only.asInstanceOf[js.Any], show_only_matches = show_only_matches.asInstanceOf[js.Any], show_only_matches_children = show_only_matches_children.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSTreeStaticDefaultsSearch]
  }
  
  @scala.inline
  implicit class JSTreeStaticDefaultsSearchOps[Self <: JSTreeStaticDefaultsSearch] (val x: Self) extends AnyVal {
    
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
    def setAjax(value: js.Any): Self = this.set("ajax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCase_sensitive(value: Boolean): Self = this.set("case_sensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose_opened_onclear(value: Boolean): Self = this.set("close_opened_onclear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFuzzy(value: Boolean): Self = this.set("fuzzy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_callback(value: js.Any): Self = this.set("search_callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_leaves_only(value: Boolean): Self = this.set("search_leaves_only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_only_matches(value: Boolean): Self = this.set("show_only_matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_only_matches_children(value: Boolean): Self = this.set("show_only_matches_children", value.asInstanceOf[js.Any])
  }
}
