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

object HexoConfig {
  @scala.inline
  def apply(
    archive_dir: java.lang.String,
    author: java.lang.String,
    category_dir: java.lang.String,
    category_map: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double],
    code_dir: java.lang.String,
    date_format: java.lang.String,
    default_category: java.lang.String,
    default_layout: java.lang.String,
    description: java.lang.String,
    external_link: scala.Boolean,
    filename_case: scala.Double,
    future: scala.Boolean,
    highlight: hexoLib.Anon_Autodetect,
    i18n_dir: java.lang.String,
    ignore: js.Array[java.lang.String],
    language: java.lang.String,
    new_post_name: java.lang.String,
    pagination_dir: java.lang.String,
    per_page: scala.Double,
    permalink: java.lang.String,
    post_asset_folder: scala.Boolean,
    public_dir: java.lang.String,
    relative_link: scala.Boolean,
    render_drafts: scala.Boolean,
    root: java.lang.String,
    source_dir: java.lang.String,
    subtitle: java.lang.String,
    tag_dir: java.lang.String,
    tag_map: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double],
    theme: java.lang.String | hexoLib.hexoLibNumbers.`false`,
    theme_config: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double],
    time_format: java.lang.String,
    timezone: java.lang.String,
    title: java.lang.String,
    titlecase: scala.Boolean,
    url: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    deploy: hexoLib.hexoMod.HexoNs.extendNs.DeployerNs.Config = null,
    exclude: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    permalink_defaults: java.lang.String = null,
    skip_render: java.lang.String | js.Array[java.lang.String] = null
  ): HexoConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("archive_dir")(archive_dir)
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("category_dir")(category_dir)
    __obj.updateDynamic("category_map")(category_map)
    __obj.updateDynamic("code_dir")(code_dir)
    __obj.updateDynamic("date_format")(date_format)
    __obj.updateDynamic("default_category")(default_category)
    __obj.updateDynamic("default_layout")(default_layout)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("external_link")(external_link)
    __obj.updateDynamic("filename_case")(filename_case)
    __obj.updateDynamic("future")(future)
    __obj.updateDynamic("highlight")(highlight)
    __obj.updateDynamic("i18n_dir")(i18n_dir)
    __obj.updateDynamic("ignore")(ignore)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("new_post_name")(new_post_name)
    __obj.updateDynamic("pagination_dir")(pagination_dir)
    __obj.updateDynamic("per_page")(per_page)
    __obj.updateDynamic("permalink")(permalink)
    __obj.updateDynamic("post_asset_folder")(post_asset_folder)
    __obj.updateDynamic("public_dir")(public_dir)
    __obj.updateDynamic("relative_link")(relative_link)
    __obj.updateDynamic("render_drafts")(render_drafts)
    __obj.updateDynamic("root")(root)
    __obj.updateDynamic("source_dir")(source_dir)
    __obj.updateDynamic("subtitle")(subtitle)
    __obj.updateDynamic("tag_dir")(tag_dir)
    __obj.updateDynamic("tag_map")(tag_map)
    __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.updateDynamic("theme_config")(theme_config)
    __obj.updateDynamic("time_format")(time_format)
    __obj.updateDynamic("timezone")(timezone)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("titlecase")(titlecase)
    __obj.updateDynamic("url")(url)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (deploy != null) __obj.updateDynamic("deploy")(deploy)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (include != null) __obj.updateDynamic("include")(include)
    if (permalink_defaults != null) __obj.updateDynamic("permalink_defaults")(permalink_defaults)
    if (skip_render != null) __obj.updateDynamic("skip_render")(skip_render.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexoConfig]
  }
}

