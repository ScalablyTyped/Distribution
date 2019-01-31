organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190119Z-9e7ce8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20180511Z-0eaf68",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180511Z-74edb2",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20180511Z-67c038",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20180511Z-9cc195",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20180511Z-ef2834",
  "org.scalablytyped" %%% "material__dom" % "0.43-dt-20190119Z-0cfb3c",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190119Z-28d617",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180511Z-d02ce3",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20180511Z-df0992",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20180511Z-2ba6d2",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20180511Z-4d3e4a",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180511Z-99f903",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20180511Z-f438c7",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190119Z-3ceb64",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20180809Z-e1a685",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180511Z-8bdbd0",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20180511Z-6adb4c",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180511Z-a7b33a",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20180511Z-40fd61",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180511Z-9c836f",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20180511Z-3d14dc",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20180511Z-684881",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20180511Z-3123a2",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20180511Z-3a7f5e",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20180511Z-fe6fb7",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20180511Z-65496f",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        