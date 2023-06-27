organization := "org.scalablytyped"
name := "material-components-web"
version := "14.0.0-ee26d0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__auto-init" % "14.0.0-fd95e4",
  "org.scalablytyped" %%% "material__banner" % "14.0.0-ecca21",
  "org.scalablytyped" %%% "material__base" % "14.0.0-b42987",
  "org.scalablytyped" %%% "material__checkbox" % "14.0.0-e931fe",
  "org.scalablytyped" %%% "material__chips" % "14.0.0-65b58e",
  "org.scalablytyped" %%% "material__circular-progress" % "14.0.0-fe0cb5",
  "org.scalablytyped" %%% "material__data-table" % "14.0.0-83b72e",
  "org.scalablytyped" %%% "material__dialog" % "14.0.0-43b74f",
  "org.scalablytyped" %%% "material__dom" % "14.0.0-9d571c",
  "org.scalablytyped" %%% "material__drawer" % "14.0.0-35e929",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-b00c3a",
  "org.scalablytyped" %%% "material__form-field" % "14.0.0-b2c22e",
  "org.scalablytyped" %%% "material__icon-button" % "14.0.0-da25c9",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-893d11",
  "org.scalablytyped" %%% "material__linear-progress" % "14.0.0-49a3d1",
  "org.scalablytyped" %%% "material__list" % "14.0.0-74b546",
  "org.scalablytyped" %%% "material__menu" % "14.0.0-784809",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-10b3bc",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-644c81",
  "org.scalablytyped" %%% "material__progress-indicator" % "14.0.0-90ecb7",
  "org.scalablytyped" %%% "material__radio" % "14.0.0-b6269f",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-94873f",
  "org.scalablytyped" %%% "material__segmented-button" % "14.0.0-1657ea",
  "org.scalablytyped" %%% "material__select" % "14.0.0-a46384",
  "org.scalablytyped" %%% "material__slider" % "14.0.0-b169c8",
  "org.scalablytyped" %%% "material__snackbar" % "14.0.0-791576",
  "org.scalablytyped" %%% "material__switch" % "14.0.0-a73f40",
  "org.scalablytyped" %%% "material__tab" % "14.0.0-c1b0b6",
  "org.scalablytyped" %%% "material__tab-bar" % "14.0.0-5e7b0b",
  "org.scalablytyped" %%% "material__tab-indicator" % "14.0.0-129318",
  "org.scalablytyped" %%% "material__tab-scroller" % "14.0.0-d8f43a",
  "org.scalablytyped" %%% "material__textfield" % "14.0.0-d9872a",
  "org.scalablytyped" %%% "material__tooltip" % "14.0.0-89f54d",
  "org.scalablytyped" %%% "material__top-app-bar" % "14.0.0-6fa72e",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
