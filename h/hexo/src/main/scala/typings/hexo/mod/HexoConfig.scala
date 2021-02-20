package typings.hexo.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hexo.anon.Autodetect
import typings.hexo.hexoBooleans.`false`
import typings.hexo.mod.extend.Deployer.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HexoConfig
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * Archive directory
    */
  val archive_dir: String = js.native
  
  /*
    * Your name
    */
  val author: String = js.native
  
  /**
    * Category directory
    */
  val category_dir: String = js.native
  
  /**
    * Category slugs
    */
  val category_map: StringDictionary[String | Double] = js.native
  
  /**
    * Include code directory (subdirectory of source_dir)
    */
  val code_dir: String = js.native
  
  /**
    * Date format
    * https://momentjs.com/
    */
  val date_format: String = js.native
  
  /**
    * Default category
    */
  val default_category: String = js.native
  
  /**
    * Default layout
    */
  val default_layout: String = js.native
  
  /**
    * Deployment settings
    */
  val deploy: Config | Null = js.native
  
  /**
    * The description of your website
    */
  val description: String = js.native
  
  /**
    * Hexo process will ignore files list under this field
    */
  val exclude: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Open external links in a new tab?
    */
  val external_link: Boolean = js.native
  
  /**
    * Transform filenames to 1 lower case; 2 upper case
    */
  val filename_case: Double = js.native
  
  /**
    * Display future posts?
    */
  val future: Boolean = js.native
  
  /**
    * Code block settings
    */
  val highlight: Autodetect = js.native
  
  /**
    * i18n directory
    */
  val i18n_dir: String = js.native
  
  val ignore: js.Array[String] = js.native
  
  /**
    * Hexo by default ignores hidden files and folders, but setting this field will make Hexo process them
    */
  val include: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The language of your website. Use a 2-lettter ISO-639-1 code. Default is en.
    */
  val language: String = js.native
  
  /**
    * The filename format for new posts
    */
  val new_post_name: String = js.native
  
  /**
    * Pagination directory
    */
  val pagination_dir: String = js.native
  
  /**
    * The amount of posts displayed on a single page. 0 disables pagination
    */
  val per_page: Double = js.native
  
  /**
    * The permalink format of articles
    */
  val permalink: String = js.native
  
  /**
    * Default values of each segment in permalink
    */
  val permalink_defaults: String | Null = js.native
  
  /**
    * Enable the Asset Folder?
    */
  val post_asset_folder: Boolean = js.native
  
  /**
    * Public folder. Where the static site will be generated
    */
  val public_dir: String = js.native
  
  /**
    * Make links relative to the root folder?
    */
  val relative_link: Boolean = js.native
  
  /**
    * Display drafts?
    */
  val render_drafts: Boolean = js.native
  
  /**
    * The root directory of your website
    */
  val root: String = js.native
  
  /**
    * Paths that will be copied to public raw, without being rendered. You can use glob expressions for path matching.
    */
  val skip_render: String | js.Array[String] | Null = js.native
  
  /**
    * Source folder. Where your content is stored
    */
  val source_dir: String = js.native
  
  /**
    * The subtitle of your website
    */
  val subtitle: String = js.native
  
  /**
    * Tag directory
    */
  val tag_dir: String = js.native
  
  /**
    * Tag slugs
    */
  val tag_map: StringDictionary[String | Double] = js.native
  
  /**
    * Theme name. false disables theming
    */
  val theme: String | `false` = js.native
  
  /**
    * Theme configuration. Include any custom theme settings under this key to override theme defaults.
    */
  val theme_config: StringDictionary[String | Double] = js.native
  
  /**
    * Time format
    * https://momentjs.com/
    */
  val time_format: String = js.native
  
  /**
    * The timezone of your website. Hexo uses the setting on your computer by default.
    * You can find the list of available timezones [here]{@link https://en.wikipedia.org/wiki/List_of_tz_database_time_zones} .
    * Some examples are `America/New_York` , `Japan` , and `UTC` .
    */
  val timezone: String = js.native
  
  /**
    * The title of your website
    */
  val title: String = js.native
  
  /**
    * Transform titles into title case?
    */
  val titlecase: Boolean = js.native
  
  /*
    * The URL of your website
    */
  val url: String = js.native
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
    url: String
  ): HexoConfig = {
    val __obj = js.Dynamic.literal(archive_dir = archive_dir.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], category_dir = category_dir.asInstanceOf[js.Any], category_map = category_map.asInstanceOf[js.Any], code_dir = code_dir.asInstanceOf[js.Any], date_format = date_format.asInstanceOf[js.Any], default_category = default_category.asInstanceOf[js.Any], default_layout = default_layout.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], external_link = external_link.asInstanceOf[js.Any], filename_case = filename_case.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], i18n_dir = i18n_dir.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], new_post_name = new_post_name.asInstanceOf[js.Any], pagination_dir = pagination_dir.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], post_asset_folder = post_asset_folder.asInstanceOf[js.Any], public_dir = public_dir.asInstanceOf[js.Any], relative_link = relative_link.asInstanceOf[js.Any], render_drafts = render_drafts.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], source_dir = source_dir.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], tag_dir = tag_dir.asInstanceOf[js.Any], tag_map = tag_map.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], theme_config = theme_config.asInstanceOf[js.Any], time_format = time_format.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlecase = titlecase.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexoConfig]
  }
  
  @scala.inline
  implicit class HexoConfigMutableBuilder[Self <: HexoConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchive_dir(value: String): Self = StObject.set(x, "archive_dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory_dir(value: String): Self = StObject.set(x, "category_dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory_map(value: StringDictionary[String | Double]): Self = StObject.set(x, "category_map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode_dir(value: String): Self = StObject.set(x, "code_dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate_format(value: String): Self = StObject.set(x, "date_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_category(value: String): Self = StObject.set(x, "default_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_layout(value: String): Self = StObject.set(x, "default_layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploy(value: Config): Self = StObject.set(x, "deploy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployNull: Self = StObject.set(x, "deploy", null)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setExternal_link(value: Boolean): Self = StObject.set(x, "external_link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename_case(value: Double): Self = StObject.set(x, "filename_case", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFuture(value: Boolean): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlight(value: Autodetect): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18n_dir(value: String): Self = StObject.set(x, "i18n_dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_post_name(value: String): Self = StObject.set(x, "new_post_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagination_dir(value: String): Self = StObject.set(x, "pagination_dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermalink(value: String): Self = StObject.set(x, "permalink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermalink_defaults(value: String): Self = StObject.set(x, "permalink_defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermalink_defaultsNull: Self = StObject.set(x, "permalink_defaults", null)
    
    @scala.inline
    def setPost_asset_folder(value: Boolean): Self = StObject.set(x, "post_asset_folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_dir(value: String): Self = StObject.set(x, "public_dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelative_link(value: Boolean): Self = StObject.set(x, "relative_link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender_drafts(value: Boolean): Self = StObject.set(x, "render_drafts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip_render(value: String | js.Array[String]): Self = StObject.set(x, "skip_render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip_renderNull: Self = StObject.set(x, "skip_render", null)
    
    @scala.inline
    def setSkip_renderVarargs(value: String*): Self = StObject.set(x, "skip_render", js.Array(value :_*))
    
    @scala.inline
    def setSource_dir(value: String): Self = StObject.set(x, "source_dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag_dir(value: String): Self = StObject.set(x, "tag_dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag_map(value: StringDictionary[String | Double]): Self = StObject.set(x, "tag_map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: String | `false`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme_config(value: StringDictionary[String | Double]): Self = StObject.set(x, "theme_config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_format(value: String): Self = StObject.set(x, "time_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlecase(value: Boolean): Self = StObject.set(x, "titlecase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
