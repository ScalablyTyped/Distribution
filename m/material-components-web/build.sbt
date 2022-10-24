organization := "org.scalablytyped"
name := "material-components-web"
version := "14.0.0-3be322"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__auto-init" % "14.0.0-9b72ee",
  "org.scalablytyped" %%% "material__banner" % "14.0.0-ef4bba",
  "org.scalablytyped" %%% "material__base" % "14.0.0-47bd03",
  "org.scalablytyped" %%% "material__checkbox" % "14.0.0-aecd1f",
  "org.scalablytyped" %%% "material__chips" % "14.0.0-557f63",
  "org.scalablytyped" %%% "material__circular-progress" % "14.0.0-bc8c70",
  "org.scalablytyped" %%% "material__data-table" % "14.0.0-ef0dff",
  "org.scalablytyped" %%% "material__dialog" % "14.0.0-16fab2",
  "org.scalablytyped" %%% "material__dom" % "14.0.0-c98dfd",
  "org.scalablytyped" %%% "material__drawer" % "14.0.0-bc1f92",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-e364e5",
  "org.scalablytyped" %%% "material__form-field" % "14.0.0-24b276",
  "org.scalablytyped" %%% "material__icon-button" % "14.0.0-19ca3d",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-afd032",
  "org.scalablytyped" %%% "material__linear-progress" % "14.0.0-f0e84a",
  "org.scalablytyped" %%% "material__list" % "14.0.0-832da1",
  "org.scalablytyped" %%% "material__menu" % "14.0.0-654c07",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-280771",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-61dc10",
  "org.scalablytyped" %%% "material__progress-indicator" % "14.0.0-5ca3a3",
  "org.scalablytyped" %%% "material__radio" % "14.0.0-0f0ecb",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-2ac12b",
  "org.scalablytyped" %%% "material__segmented-button" % "14.0.0-712fbb",
  "org.scalablytyped" %%% "material__select" % "14.0.0-9c5a17",
  "org.scalablytyped" %%% "material__slider" % "14.0.0-b433b1",
  "org.scalablytyped" %%% "material__snackbar" % "14.0.0-0439e7",
  "org.scalablytyped" %%% "material__switch" % "14.0.0-ab36ef",
  "org.scalablytyped" %%% "material__tab" % "14.0.0-3da770",
  "org.scalablytyped" %%% "material__tab-bar" % "14.0.0-674db4",
  "org.scalablytyped" %%% "material__tab-indicator" % "14.0.0-cabf24",
  "org.scalablytyped" %%% "material__tab-scroller" % "14.0.0-5bc5cf",
  "org.scalablytyped" %%% "material__textfield" % "14.0.0-89f83c",
  "org.scalablytyped" %%% "material__tooltip" % "14.0.0-074934",
  "org.scalablytyped" %%% "material__top-app-bar" % "14.0.0-ecda93",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
