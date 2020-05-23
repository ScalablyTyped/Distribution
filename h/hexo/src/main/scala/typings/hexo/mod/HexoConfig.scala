package typings.hexo.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hexo.anon.Autodetect
import typings.hexo.hexoBooleans.`false`
import typings.hexo.mod.extend.Deployer.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HexoConfig
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Archive directory
    */
  val archive_dir: String
  /*
    * Your name
    */
  val author: String
  /**
    * Category directory
    */
  val category_dir: String
  /**
    * Category slugs
    */
  val category_map: StringDictionary[String | Double]
  /**
    * Include code directory (subdirectory of source_dir)
    */
  val code_dir: String
  /**
    * Date format
    * https://momentjs.com/
    */
  val date_format: String
  /**
    * Default category
    */
  val default_category: String
  /**
    * Default layout
    */
  val default_layout: String
  /**
    * Deployment settings
    */
  val deploy: Config | Null
  /**
    * The description of your website
    */
  val description: String
  /**
    * Hexo process will ignore files list under this field
    */
  val exclude: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Open external links in a new tab?
    */
  val external_link: Boolean
  /**
    * Transform filenames to 1 lower case; 2 upper case
    */
  val filename_case: Double
  /**
    * Display future posts?
    */
  val future: Boolean
  /**
    * Code block settings
    */
  val highlight: Autodetect
  /**
    * i18n directory
    */
  val i18n_dir: String
  val ignore: js.Array[String]
  /**
    * Hexo by default ignores hidden files and folders, but setting this field will make Hexo process them
    */
  val include: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The language of your website. Use a 2-lettter ISO-639-1 code. Default is en.
    */
  val language: String
  /**
    * The filename format for new posts
    */
  val new_post_name: String
  /**
    * Pagination directory
    */
  val pagination_dir: String
  /**
    * The amount of posts displayed on a single page. 0 disables pagination
    */
  val per_page: Double
  /**
    * The permalink format of articles
    */
  val permalink: String
  /**
    * Default values of each segment in permalink
    */
  val permalink_defaults: String | Null
  /**
    * Enable the Asset Folder?
    */
  val post_asset_folder: Boolean
  /**
    * Public folder. Where the static site will be generated
    */
  val public_dir: String
  /**
    * Make links relative to the root folder?
    */
  val relative_link: Boolean
  /**
    * Display drafts?
    */
  val render_drafts: Boolean
  /**
    * The root directory of your website
    */
  val root: String
  /**
    * Paths that will be copied to public raw, without being rendered. You can use glob expressions for path matching.
    */
  val skip_render: String | js.Array[String] | Null
  /**
    * Source folder. Where your content is stored
    */
  val source_dir: String
  /**
    * The subtitle of your website
    */
  val subtitle: String
  /**
    * Tag directory
    */
  val tag_dir: String
  /**
    * Tag slugs
    */
  val tag_map: StringDictionary[String | Double]
  /**
    * Theme name. false disables theming
    */
  val theme: String | `false`
  /**
    * Theme configuration. Include any custom theme settings under this key to override theme defaults.
    */
  val theme_config: StringDictionary[String | Double]
  /**
    * Time format
    * https://momentjs.com/
    */
  val time_format: String
  /**
    * The timezone of your website. Hexo uses the setting on your computer by default.
    * You can find the list of available timezones [here]{@link https://en.wikipedia.org/wiki/List_of_tz_database_time_zones} .
    * Some examples are `America/New_York` , `Japan` , and `UTC` .
    */
  val timezone: String
  /**
    * The title of your website
    */
  val title: String
  /**
    * Transform titles into title case?
    */
  val titlecase: Boolean
  /*
    * The URL of your website
    */
  val url: String
}

object HexoConfig {
  @scala.inline
  def apply(
    archive_dir: String,
    author: String,
    category_dir: String,
    category_map: StringDictionary[String | Double],
    code_dir: String,
    date_format: String,
    default_category: String,
    default_layout: String,
    description: String,
    external_link: Boolean,
    filename_case: Double,
    future: Boolean,
    highlight: Autodetect,
    i18n_dir: String,
    ignore: js.Array[String],
    language: String,
    new_post_name: String,
    pagination_dir: String,
    per_page: Double,
    permalink: String,
    post_asset_folder: Boolean,
    public_dir: String,
    relative_link: Boolean,
    render_drafts: Boolean,
    root: String,
    source_dir: String,
    subtitle: String,
    tag_dir: String,
    tag_map: StringDictionary[String | Double],
    theme: String | `false`,
    theme_config: StringDictionary[String | Double],
    time_format: String,
    timezone: String,
    title: String,
    titlecase: Boolean,
    url: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    deploy: Config = null,
    exclude: js.Array[String] = null,
    include: js.Array[String] = null,
    permalink_defaults: String = null,
    skip_render: String | js.Array[String] = null
  ): HexoConfig = {
    val __obj = js.Dynamic.literal(archive_dir = archive_dir.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], category_dir = category_dir.asInstanceOf[js.Any], category_map = category_map.asInstanceOf[js.Any], code_dir = code_dir.asInstanceOf[js.Any], date_format = date_format.asInstanceOf[js.Any], default_category = default_category.asInstanceOf[js.Any], default_layout = default_layout.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], external_link = external_link.asInstanceOf[js.Any], filename_case = filename_case.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], i18n_dir = i18n_dir.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], new_post_name = new_post_name.asInstanceOf[js.Any], pagination_dir = pagination_dir.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], post_asset_folder = post_asset_folder.asInstanceOf[js.Any], public_dir = public_dir.asInstanceOf[js.Any], relative_link = relative_link.asInstanceOf[js.Any], render_drafts = render_drafts.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], source_dir = source_dir.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], tag_dir = tag_dir.asInstanceOf[js.Any], tag_map = tag_map.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], theme_config = theme_config.asInstanceOf[js.Any], time_format = time_format.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlecase = titlecase.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], deploy = deploy.asInstanceOf[js.Any], permalink_defaults = permalink_defaults.asInstanceOf[js.Any], skip_render = skip_render.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexoConfig]
  }
}

