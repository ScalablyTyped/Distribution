package typings
package hexoLib.hexoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HexoConfig
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Archive directory
    */
  val archive_dir: java.lang.String
  /*
    * Your name
    */
  val author: java.lang.String
  /**
    * Category directory
    */
  val category_dir: java.lang.String
  /**
    * Category slugs
    */
  val category_map: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  /**
    * Include code directory (subdirectory of source_dir)
    */
  val code_dir: java.lang.String
  /**
    * Date format
    * https://momentjs.com/
    */
  val date_format: java.lang.String
  /**
    * Default category
    */
  val default_category: java.lang.String
  /**
    * Default layout
    */
  val default_layout: java.lang.String
  /**
    * Deployment settings
    */
  val deploy: hexoLib.hexoMod.HexoNs.extendNs.DeployerNs.Config | scala.Null
  /**
    * The description of your website
    */
  val description: java.lang.String
  /**
    * Hexo process will ignore files list under this field
    */
  val exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Open external links in a new tab?
    */
  val external_link: scala.Boolean
  /**
    * Transform filenames to 1 lower case; 2 upper case
    */
  val filename_case: scala.Double
  /**
    * Display future posts?
    */
  val future: scala.Boolean
  /**
    * Code block settings
    */
  val highlight: hexoLib.Anon_Autodetect
  /**
    * i18n directory
    */
  val i18n_dir: java.lang.String
  val ignore: js.Array[java.lang.String]
  /**
    * Hexo by default ignores hidden files and folders, but setting this field will make Hexo process them
    */
  val include: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The language of your website. Use a 2-lettter ISO-639-1 code. Default is en.
    */
  val language: java.lang.String
  /**
    * The filename format for new posts
    */
  val new_post_name: java.lang.String
  /**
    * Pagination directory
    */
  val pagination_dir: java.lang.String
  /**
    * The amount of posts displayed on a single page. 0 disables pagination
    */
  val per_page: scala.Double
  /**
    * The permalink format of articles
    */
  val permalink: java.lang.String
  /**
    * Default values of each segment in permalink
    */
  val permalink_defaults: java.lang.String | scala.Null
  /**
    * Enable the Asset Folder?
    */
  val post_asset_folder: scala.Boolean
  /**
    * Public folder. Where the static site will be generated
    */
  val public_dir: java.lang.String
  /**
    * Make links relative to the root folder?
    */
  val relative_link: scala.Boolean
  /**
    * Display drafts?
    */
  val render_drafts: scala.Boolean
  /**
    * The root directory of your website
    */
  val root: java.lang.String
  /**
    * Paths that will be copied to public raw, without being rendered. You can use glob expressions for path matching.
    */
  val skip_render: java.lang.String | js.Array[java.lang.String] | scala.Null
  /**
    * Source folder. Where your content is stored
    */
  val source_dir: java.lang.String
  /**
    * The subtitle of your website
    */
  val subtitle: java.lang.String
  /**
    * Tag directory
    */
  val tag_dir: java.lang.String
  /**
    * Tag slugs
    */
  val tag_map: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  /**
    * Theme name. false disables theming
    */
  val theme: java.lang.String | hexoLib.hexoLibNumbers.`false`
  /**
    * Theme configuration. Include any custom theme settings under this key to override theme defaults.
    */
  val theme_config: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  /**
    * Time format
    * https://momentjs.com/
    */
  val time_format: java.lang.String
  /**
    * The timezone of your website. Hexo uses the setting on your computer by default.
    * You can find the list of available timezones [here]{@link https://en.wikipedia.org/wiki/List_of_tz_database_time_zones} .
    * Some examples are `America/New_York` , `Japan` , and `UTC` .
    */
  val timezone: java.lang.String
  /**
    * The title of your website
    */
  val title: java.lang.String
  /**
    * Transform titles into title case?
    */
  val titlecase: scala.Boolean
  /*
    * The URL of your website
    */
  val url: java.lang.String
}

