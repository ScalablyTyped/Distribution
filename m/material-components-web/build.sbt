organization := "org.scalablytyped"
name := "material-components-web"
version := "0.35-dt-20180910Z-6f8dd4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20180910Z-c92630",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180910Z-40a1b8",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20180910Z-796797",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20180910Z-c145a6",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20180910Z-b39000",
  "org.scalablytyped" %%% "material__drawer" % "0.35-dt-20180910Z-f27b96",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180910Z-5d0cdb",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20180910Z-cfe6e9",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20180910Z-938356",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20180910Z-6d6906",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180910Z-cc33e6",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20180910Z-4f4979",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20180910Z-4e4c61",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180910Z-b77938",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20180910Z-d28ad9",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180910Z-495c09",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20180910Z-e0af21",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180910Z-869f65",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20180910Z-c79d6e",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20180910Z-205724",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20180910Z-79268b",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20180910Z-52bbc6",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20180910Z-91920e",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20180910Z-d8973d",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        