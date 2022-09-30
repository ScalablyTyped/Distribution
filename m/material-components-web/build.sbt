organization := "org.scalablytyped"
name := "material-components-web"
version := "14.0.0-05b417"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__auto-init" % "14.0.0-a9ad09",
  "org.scalablytyped" %%% "material__banner" % "14.0.0-38d650",
  "org.scalablytyped" %%% "material__base" % "14.0.0-b7cc0b",
  "org.scalablytyped" %%% "material__checkbox" % "14.0.0-140bd6",
  "org.scalablytyped" %%% "material__chips" % "14.0.0-aabb3a",
  "org.scalablytyped" %%% "material__circular-progress" % "14.0.0-1b58ff",
  "org.scalablytyped" %%% "material__data-table" % "14.0.0-141ab1",
  "org.scalablytyped" %%% "material__dialog" % "14.0.0-3241ff",
  "org.scalablytyped" %%% "material__dom" % "14.0.0-8107a0",
  "org.scalablytyped" %%% "material__drawer" % "14.0.0-738c03",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-2810ba",
  "org.scalablytyped" %%% "material__form-field" % "14.0.0-01e2a3",
  "org.scalablytyped" %%% "material__icon-button" % "14.0.0-f80584",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-e1986d",
  "org.scalablytyped" %%% "material__linear-progress" % "14.0.0-ace42f",
  "org.scalablytyped" %%% "material__list" % "14.0.0-628397",
  "org.scalablytyped" %%% "material__menu" % "14.0.0-d391d5",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-1b2282",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-944189",
  "org.scalablytyped" %%% "material__progress-indicator" % "14.0.0-bb4c94",
  "org.scalablytyped" %%% "material__radio" % "14.0.0-bd4bad",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-160434",
  "org.scalablytyped" %%% "material__segmented-button" % "14.0.0-bc327b",
  "org.scalablytyped" %%% "material__select" % "14.0.0-8602d2",
  "org.scalablytyped" %%% "material__slider" % "14.0.0-671281",
  "org.scalablytyped" %%% "material__snackbar" % "14.0.0-b94598",
  "org.scalablytyped" %%% "material__switch" % "14.0.0-6d12cb",
  "org.scalablytyped" %%% "material__tab" % "14.0.0-d44417",
  "org.scalablytyped" %%% "material__tab-bar" % "14.0.0-3a740d",
  "org.scalablytyped" %%% "material__tab-indicator" % "14.0.0-d20571",
  "org.scalablytyped" %%% "material__tab-scroller" % "14.0.0-ff51dc",
  "org.scalablytyped" %%% "material__textfield" % "14.0.0-3b85d7",
  "org.scalablytyped" %%% "material__tooltip" % "14.0.0-187771",
  "org.scalablytyped" %%% "material__top-app-bar" % "14.0.0-986a80",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
